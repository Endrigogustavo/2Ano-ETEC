const pokemonContainer = document.querySelector(".pokemon-container")

async function getPokemons(offset, limit){
    const res = await fetch(
        `https://pokeapi.co/api/v2/pokemon/?offset=${offset}&limit=${limit}`
    )
    const json = await res.json()

    const pokemons = await Promise.all(
        json.results.map(async ({ url })=> {
            const pokemonRes = await fetch(url)
            return pokemonRes.json()
        })
    )

    render(pokemons)
}
function render(pokemons){
    pokemonContainer.innerHTML = null

    pokemons.forEach((pokemon) => {
        const card = `
        <li class="card" onClick="this.classlist.toggle('flipped')">
        <img
            src="${pokemon.sprites.front_default}"
            alt="${pokemon.name}"
            loading="lazy"
            class="sprite"
            />
            <p class="name">${pokemon.name}</p>
        </li>
        `

        pokemonContainer.innerHTML += card
    })


}   
 getPokemons()