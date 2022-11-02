# language: ru

Функция: Сисстема для поваров

  Структура сценария: Добавление торта

    Дано открыта главная страница

    Когда пользователь нажимает "Добавить торт"
    Когда прописывает "<Title>" в "Названии"
    Когда прописывает "<Description>" в "Описании"
   # Когда выбирает повод: "<reason>"
   # Когда выбирает для кого: "<forWhom>"
   # Когда добавляет фото
    Когда пользователь нажимает "Добавить"

   # Тогда торт добавлен

    Примеры:
      | Title                | Description                    |reason             | forWhom     |
      | Cake                 | Simple Cake                    | birthdayReason    |  checkBoy   |
      | Sweet cake           | Very sweet and tasty cake      | otherReason       |  checkWoman |
      | Apple pie and crisps | Missing                        | christeningReason |  checkOther |
