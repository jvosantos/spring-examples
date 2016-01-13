package com.jvosantos.examples.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

@Service
@Named("i18nMessageOfTheDay")
public class I18nDynamicMessageOfTheDay implements MessageOfTheDayService {

  private static String KEY_PREFIX = "messageOfTheDay.";

  private String language;

  private String country;

  private MessageSource messageSource;

  public I18nDynamicMessageOfTheDay() {

  }

  public String getLanguage() {
    return language;
  }

  @Value("${i18nMessageOfDay.language}")
  public void setLanguage(String language) {
    this.language = language;
  }

  public String getCountry() {
    return country;
  }

  @Value("${i18nMessageOfDay.country}")
  public void setCountry(String country) {
    this.country = country;
  }

  public MessageSource getMessageSource() {
    return messageSource;
  }

  @Inject
  public void setMessageSource(MessageSource messageSource) {
    this.messageSource = messageSource;
  }

  @Override
  public String getMessage() {
    final String day = GregorianCalendar.getInstance().getDisplayName(Calendar.DAY_OF_WEEK, Calendar.SHORT, Locale.US);
    final Locale locale = new Locale(language, country);

    return messageSource.getMessage(KEY_PREFIX + day, null, locale);

  }
}
