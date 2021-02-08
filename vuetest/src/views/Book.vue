<template>
  <div>
    <table>
      <tr>
        <td>编号</td>
        <td>图书名称</td>
        <td>作者</td>
      </tr>
      <tr v-for="item in books">
        <td>{{item.id}}</td>
        <td>{{item.name}}</td>
        <td>{{item.author}}</td>
        <td></td>
        <td></td>
      </tr>
    </table>
    {{ msg }}
  </div>
</template>

<script>
export default {
  name: "Book",
  data(){
    return{
      msg: 'Hello Vue',
      books:[
        {
          id:1,
          name: '11',
          author: '111',
        },
        {
          id:2,
          name: '22',
          author: '222',
        },
        {
          id:3,
          name: '33',
          author: '333',
        }
      ]
    }
  },
  created() {
    const _this = this  //将vue中的this，赋给回掉的this
    axios.get('http://localhost:8181/book/findAll').then(function (resp){
      // this.tableData = resp.data.data
      // console.log(resp)
      _this.books = resp.data   // 把后台返回的数据放在books里面
    })
  }
}
</script>

<style scoped>

</style>