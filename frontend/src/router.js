import Vue from "vue";
import Router from 'vue-router'
import HotTop from "./page/HotTop.vue"

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: "/",
      name: "HotTop",
      component:  HotTop
    }
  ]
})