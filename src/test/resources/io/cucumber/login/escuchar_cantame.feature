Feature: Escuchar cántame
  Scenario: Escuchar dentro del rango
    Given Pati está localizado 10 metros de Javi
    When Javi canta "café gratuito en la cafetería"
    Then Pati escucha el mensaje de Javi
