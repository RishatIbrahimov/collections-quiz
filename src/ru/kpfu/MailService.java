package ru.kpfu;

import java.util.List;
import java.util.Map;

/**
 * @author Rishat Ibrahimov
 */
public interface MailService<T> {

  Map<String, List<T>> getMailBox();
}
