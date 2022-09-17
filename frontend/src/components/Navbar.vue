<template>
  <div>
    <ul>
      <li><a :href="caminhoLink1">{{ link1 }}</a></li>
      <li>{{ link2 }}</li>
      <li>{{ link3 }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'Navbar',
  props: {
    link1: String,
    caminhoLink1: String,
    link2: String,
    link3: String
  }
}
</script>

<style scoped>
div ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
}
li {
  display: inline;
}
</style>
