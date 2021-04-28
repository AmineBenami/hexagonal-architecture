import axios from 'axios'

const AXIOS = axios.create({
  baseURL: `/counters`,
  timeout: 1000
});


export default {
    createCounter(key) {
        const json = JSON.stringify({ key: key }),
        return AXIOS.post(`/`, json, {
            headers: {
              'Content-Type': 'application/json'
            }
        });
    },
    incrementCounter(key) {
        return AXIOS.post(key + `/increment/`)
    }
}


