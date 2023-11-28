Vue.component('house-row',{
    props:['house'],
template:'<div><i>({{house.id}})</i> {{house.name}}</div>'
})


Vue.component('houses-list', {
    props:['houses'],//чтобы компонент понимал
     //что в него приходят данные под этим именем

  template: '<div>'+
  '<house-row'+
  ' v-for="house in houses"  v-bind:key="house.id" :house="house">'+
  ' </house-row>'+
  '</div>' //выводим имена домов в шаблоне
})


let app=new Vue({ //houses-list :houses="houses"-пропихиваем в компонент данные из houses
    el:'#app',
    template:'<houses-list :houses="houses"/>', //исп компонент houses-list;
    // выводим с помощью него массив из хаусов
    data: {
        houses: [
        {id:'1',name:'house1'},
        {id:'2',name:'house2'},
        {id:'3',name:'house3'},
        ]
    }
})