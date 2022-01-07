from lxml import etree
import requests
import json

# tree = etree.parse()


def search():
    headers = {
        'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36',
    }

    url = 'https://tophub.today/n/KqndgxeLl9'



    response = requests.get(url=url, headers=headers)
    raw_data = response

    with open ('hotTop.html',"w",encoding="utf-8") as f:
    #   写文件用bytes而不是str，所以要转码
        f.write( raw_data.text )


    tree = etree.parse('./hotTop.html', etree.HTMLParser())
    linkR = tree.xpath('////tbody//td[@class="al"]/a/@href')
    contentR = tree.xpath('////tbody//td[@class="al"]/a/text()')
    count = 1
    data = []
    for i in range(0,len(contentR)):
        temp = {}
        temp['title'] = contentR[i]
        temp['link'] = "https://tophub.today"+linkR[i]
        temp = json.dumps(temp)
        data.append(temp)


if __name__ == "__main__":
    result = search()


from lxml import etree
import requests

# tree = etree.parse()


def search():
    headers = {
        'User-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36',
    }

    url = 'https://tophub.today/n/KqndgxeLl9'



    response = requests.get(url=url, headers=headers)
    raw_data = response

    with open ('hotTop.html',"w",encoding="utf-8") as f:
    #   写文件用bytes而不是str，所以要转码
        f.write( raw_data.text )


    tree = etree.parse('./hotTop.html', etree.HTMLParser())
    linkR = tree.xpath('////tbody//td[@class="al"]/a/@href')
    contentR = tree.xpath('////tbody//td[@class="al"]/a/text()')
    count = 1
    data = []
    for i in range(0,len(contentR)):
        # temp = {}
        # temp[title] = contentR[i]
        # temp[link] = "https://tophub.today"+linkR[i]
        temp = dict(rank = i+1,title=contentR[i], link="https://tophub.today"+linkR[i])
        temp = json.dumps(temp, ensure_ascii=False)
        print(temp)


if __name__ == "__main__":
    result = search()


