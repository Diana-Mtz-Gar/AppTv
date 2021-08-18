package com.example.peliculas;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "Todos",
            "Comedia",
            "Romantica",
            "Acción",
            "Infantiles",
            "Estrenos",
    };

    private static List<Movie> list;
    private static long count = 0;

    public static List<Movie> getList() {
        if( list == null ) {
            list = setupMovies();
        }
        return list;
    }

    public static List<Movie> setupMovies() {
        list = new ArrayList<>();
        String title[] = {
                "Todo mal",
                "Rapidos y furiosos",
                "Yo antes de ti",
                "Mascotas 2",
                "La Crucifixión"
        };

        String description [] = {"Con Alfonso Dosal, Osvaldo Benavidas, Martín Altomaro y Marcela Guirado. Fernando es un diplomático que acaba de conseguir el logro más importante de su carrera: regresar el penacho de Moctezuma a México, y además, está a punto de casarse con la mujer de su vida. Todo es perfección con él, a diferencia de con sus dos primos, Matías, ex-estrella Pop y rocanrolero fallido, y Dante, para siempre intentando terminar una tesis infinita, mientras vive en el clóset de su mamá. Pero serán Matías y Dante que harán de todo para salvar a Fernando, cuando este pierde el control, tras terminar plantado en el altar, se roba el penacho y emprende una venganza demente que puede costarle el pellejo a él, y al país una reliquia histórica.",
                "Dominic Toretto es acusado de ser el líder de una banda que se dedica a asaltar camiones cargados con aparatos electrónicos. Sin embargo, el FBI no tiene pruebas contundentes por lo que manda de encubierto al agente Brian O'Conner para que se involucre en las carreras ilegales de autos y contacte a Toretto. Con el tiempo, Brian se gana la confianza de Dominic y lo hace parte de su vida al grado de que Brian se enamora de la hermana de Dominic por lo que trata de demostrar que Toretto es inocente en lugar de buscar inculparlo.",
                "La joven y peculiar Louisa “Lou” Clark (Emilia Clarke) pasa de un empleo a otro para ayudar a mantener a su familia. Su alegre actitud se pone a prueba cuando ella se convierte en proveedor de cuidados para Will Traynor (Sam Claflin), un joven y adinerado banquero que quedó paralizado en un accidente dos años atrás. La perspectiva cínica de Will comienza a cambiar cuando Louisa le muestra que vale la pena vivir. Conforme se fortalece su vínculo, sus vidas y corazones cambian en maneras que ninguno de los dos jamás hubiera imaginado.",
                "La Vida Secreta de tus Mascotas 2 continúa la historia de Max (Patton Oswalt), Gidget (Jenny Slate), Snowball (Kevin Hart) y el resto de la pandilla a medida que emprenden nuevas aventuras y se sienten empujados a encontrar el coraje para convertirse en superhéroes. Explora la vida emocional de nuestras mascotas, el vínculo profundo entre ellas, las familias que las aman, y descubre lo que realmente hacen las mascotas cuando no estás en casa.",
                "Basada en hechos reales, esta es la historia del viaje de Nicole Rawlins una joven periodista, que trata de desentrañar el misterio detrás de un brutal asesinato en Rumanía donde el presunto culpable, el sacerdote Corogeanu está encarcelado por el matar a una monja durante un exorcismo. Pero Nicole empieza a experimentar una presencia demoníaca, y ahora está determinada a descubrir si las acusaciones contra el sacerdote son verídicas o si él está luchando contra un demonio."
        };
        String studio[] = {"Lanzamiento: 2018","Lanzamiento: 2001", "Lanzamiento: 2016", "Lanzamiento: 2019", "Lanzamiento: 2018"};
        String videoUrl[] = {
                "https://youtu.be/8KTvdAUKddA",
                "https://youtu.be/MRN5-P8T-QU",
                "https://youtu.be/Kb6-AcJXbpg",
                "https://youtu.be/PAxK5--Go3k",
                "https://youtu.be/Ord07Ba3KEg"
        };
        String bgImageUrl[] = {
                "https://i.ytimg.com/vi_webp/8KTvdAUKddA/movieposter_es-419.webp",
                "https://i.ytimg.com/vi_webp/MRN5-P8T-QU/movieposter.webp",
                "https://i.ytimg.com/vi_webp/Kb6-AcJXbpg/movieposter.webp",
                "https://i.ytimg.com/vi/PAxK5--Go3k/movieposter.jpg",
                "https://i.ytimg.com/vi_webp/Ord07Ba3KEg/movieposter_es-419.webp",
        };
        String cardImageUrl[] = {
                "https://i.ytimg.com/vi_webp/8KTvdAUKddA/movieposter_es-419.webp",
                "https://i.ytimg.com/vi_webp/MRN5-P8T-QU/movieposter.webp",
                "https://i.ytimg.com/vi_webp/Kb6-AcJXbpg/movieposter.webp",
                "https://i.ytimg.com/vi/PAxK5--Go3k/movieposter.jpg",
                "https://i.ytimg.com/vi_webp/Ord07Ba3KEg/movieposter_es-419.webp"
        };

        for (int index = 0; index < title.length; ++index) {
            list.add(
                    buildMovieInfo(
                            title[index],
                            description[index],
                            studio[index],
                            videoUrl[index],
                            cardImageUrl[index],
                            bgImageUrl[index]));
        }
        return list;
    }

    private static Movie buildMovieInfo(
            String title,
            String description,
            String studio,
            String videoUrl,
            String cardImageUrl,
            String backgroundImageUrl) {
        Movie movie = new Movie();
        movie.setId(count++);
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(backgroundImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}