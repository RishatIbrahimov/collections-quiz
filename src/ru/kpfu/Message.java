package ru.kpfu;

/**
 * @author Rishat Ibrahimov
 */
public interface Message<T> {
  String getFrom();

  String getTo();

  T getContent();
}
