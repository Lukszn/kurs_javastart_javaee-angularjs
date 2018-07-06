package pl.javastart.model;

import javax.enterprise.inject.Produces;
import pl.javastart.qualifiers.FileName;

public class Config {

    @Produces @FileName
    private String fileName = "/message.txt";

}