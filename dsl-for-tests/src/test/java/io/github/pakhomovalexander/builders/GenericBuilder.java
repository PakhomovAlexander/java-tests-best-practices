package io.github.pakhomovalexander.builders;

public interface GenericBuilder<T, B extends GenericBuilder<T, B>> {
    T build();
}
