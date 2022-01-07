<template>
  <div>
    {{rawData}}
  </div>
</template>

<script>

import axios from 'axios'
const requests = axios.create({ baseURL:'http://localhost:8080'})


export default {
  data() {
    return {
      rawData: []
    }
  },

  mounted() {
    this.getList()
  },

  methods: {
    getList() {
      requests.get('/python').then(res => {
        this.rawData = res.data
        this.getTitle(this.rawData)
      })
    },

    getTitle(rawData) {
      console.log(rawData[1])
      // for(let i = 0; i < rawData.length; i++) {
      //   console.log(rawData[i])
      // }
    },
  }
}


</script>
<style>

</style>