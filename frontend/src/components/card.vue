<template>
  <p>{{rawData.title}}</p>
</template>

<script>
export default {
  props: {
    rawData: Object
  },
  // mounted() {
  //   this.test()
  // },
  // methods: {
  //   test() {
  //     console.log(JSON.parse(this.rawData).title)
  //   }
  // }
}
</script>