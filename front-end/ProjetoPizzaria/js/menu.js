const pizzas = require('./arrayPizzas.json')

function listarPreco(pizzas) {
    return pizzas.filter((pizza) => {
        return pizza
    }
    )
}
console.log(listarPreco(pizzas));