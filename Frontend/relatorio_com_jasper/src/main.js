import { createApp } from 'vue';
import VueRouter from 'vue-router';
import Home from './homepage/home';
import App from './App.vue';

Vue.use(VueRouter);

const routes = [
    { path: '/', component: Home }
];

const router = new VueRouter({
   routes
});

createApp(App).mount('#app')
