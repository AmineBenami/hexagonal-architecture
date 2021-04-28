<template>
  <div id="app">
    <div>
      <input v-model="key">
      <button @click="createCounter">
        Create
      </button>
      <button @click="incrementCounter">
        Increment
      </button>
      <br>
      <div>{{ countVal }}</div>
    </div>
  </div>
</template>

<script>
import api from "@components/backend-api";
export default {
  name: 'app',
  data () {
    return {
      key: '',
      countVal: ''
    }
  },
  methods: {
  	createCounter: function(){
      if (this.key.lenght > 0) {
        api.createCounter(this.key).then(response => {
              this.countVal = response.data.count;
        })
        .catch(e => {
              console.error(e)
        })
      }
    },
    incrementCounter: function(){ 
      if (this.key.lenght > 0) {  	
        api.incremenetCounter(this.key).then(response => {
              this.countVal = response.data.count;
        })
        .catch(e => {
              console.error(e)
        })
      }
    }
  }
}
</script>

<style lang="scss">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 20px;
}
</style>
