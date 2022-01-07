<template>
  <p>{{rawData.rank+"."+rawData.title}}</p>
</template>

<script>
export default {
  props: {
    rawData: Object
  },

}
</script>