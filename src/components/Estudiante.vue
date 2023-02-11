<template>
  <h1>Servicio Estudiante</h1>
  <input type="text" v-model="id" />
  <button @click="APIEstudiante(id)">Buscar</button>
  <div class="estudiante" v-if="estudiante">
    <label for="id">Id: </label>
    <input type="text" :value="this.estudiante.id" readonly />
    <label for="nombre">Nombre: </label>
    <input type="text" :value="this.estudiante.nombre" readonly />
    <label for="apellido">Apellido: </label>
    <input type="text" :value="this.estudiante.apellido" readonly />
    <label for="fecha-nacimiento">Fecha nacimiento: </label>
    <input type="text" :value="this.estudiante.fechaNacimiento" readonly />
    <label for="salario">Salario: </label>
    <input type="text" :value="this.estudiante.salario" readonly />
  </div>
</template>

<script>
export default {
  data() {
    return {
      id: 0,
      estudiante: null,
    };
  },
  methods: {
    async APIEstudiante(id) {
      const estudiante = await fetch(`http://localhost:8090/API/Matricula/V1/estudaintes/${id}`).then(r => r.json());
      this.estudiante = estudiante;
    },
  },
};
</script>

<style>
.estudiante {
  background: #ecf0f1;
  width: 30vw;
  height: 40vh;
  margin: 30px auto;
  padding: 30px;
  border-radius: 15px;
  display: flex;
  flex-direction: column;
}

.estudiante input{
    margin-bottom: 15px;
    text-align: center;
}
</style>