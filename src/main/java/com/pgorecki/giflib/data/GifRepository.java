package com.pgorecki.giflib.data;

import com.pgorecki.giflib.model.Gif;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("robot1", LocalDate.of(2015, 2, 13), "Alice", true),
            new Gif("robot2", LocalDate.of(2015, 3, 22), "Bob", false),
            new Gif("robot3", LocalDate.of(2015, 1, 8), "Charlie", true)
    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if (gif.getName().equals(name)) {
                return gif;
            }
        }
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }
}
