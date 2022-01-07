<template>
  <div>
    <Card v-for="(data, index) in rawData" :key="index" :rawData="JSON.parse(data)"/>
  </div>
</template>

<script>

import axios from 'axios'
import Card from '../components/card.vue'
const requests = axios.create({ baseURL:'http://localhost:8080'})


export default {
  components: {
    Card,
  },
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
      })
    },

  }
}


</script>
<style>

</style>