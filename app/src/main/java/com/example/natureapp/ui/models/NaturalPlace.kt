package com.example.natureapp.ui.models

data class NaturalPlace(
    val image: String,
    val title : String,
    val description: String
)

val naturalPlaces = listOf(
    NaturalPlace(
        image = "https://toursalgrancanon.com/wp-content/uploads/2019/04/cascadas-gran-canon.jpg",
        title = "Gran Cañón",
        description = "El Gran Cañón es una de las maravillas naturales más impresionantes del mundo, ubicado en Arizona, Estados Unidos."
    ),
    NaturalPlace(
        image = "https://external-preview.redd.it/parque-nacional-de-los-fiordos-de-kenai-y-5-razones-para-v0-ZZ0NVlVzefnFi9TH30DDgBEVmNHVB7WEYA4rYp8vy4Q.jpg?width=1080&crop=smart&auto=webp&s=273a773f2f51f98a5d93480323d31144a9d8a6ba",
        title = "Parque Nacional de los Fiordos",
        description = "El Parque Nacional de los Fiordos de Noruega ofrece paisajes majestuosos de montañas y fiordos que se extienden a lo largo de la costa noruega."
    ),
    NaturalPlace(
        image = "https://media.traveler.es/photos/63ecf8d844c1a0e03615a59e/16:9/w_2560%2Cc_limit/2H0WB0B%2520(1).jpg",
        title = "Gran Barrera de Coral",
        description = "La Gran Barrera de Coral en Australia es el mayor sistema de arrecifes de coral del mundo y hogar de una increíble biodiversidad marina."
    ),
    NaturalPlace(
        image = "https://content.nationalgeographic.com.es/medio/2022/09/16/selva-tropical-amazonica-ecuador_135ea5a5_1280x853.jpg",
        title = "Selva Amazónica",
        description = "La Selva Amazónica es la selva tropical más grande del planeta, con una biodiversidad inigualable y un ecosistema vital para el clima global."
    ),
    NaturalPlace(
        image = "https://cdn.computerhoy.com/sites/navi.axelspringer.es/public/media/image/2020/12/china-nepal-llegan-acuerdo-fin-sabemos-altura-exacta-everest-2163191.jpg?tf=3840x",
        title = "Monte Everest",
        description = "El Monte Everest, ubicado en la cordillera del Himalaya, es la montaña más alta del mundo y un desafío extremo para los escaladores."
    )
)
