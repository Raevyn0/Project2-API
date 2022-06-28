package com.revature.pokedeck.util.exceptions;

public class ResourceNotFoundException extends  RuntimeException{

    public ResourceNotFoundException() {
        super("No resource found using the provided search params!");
    }
}
