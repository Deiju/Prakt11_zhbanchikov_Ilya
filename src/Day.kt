enum class Day {
    Mon{
        override fun day():String= "Понедельник"
        override fun days()=1
        override fun weekend():String="Рабочий день"
        override fun Motivation(): String="Начинаем работать"
    },
    Tue{
        override fun day():String= "Вторник"
        override fun days()=2
        override fun weekend():String="Рабочий день"
        override fun Motivation(): String="Идём вперёд"
    },
    Wed{
        override fun day():String= "Среда"
        override fun days()=3
        override fun weekend():String="Рабочий день"
        override fun Motivation(): String="половина пятницы"
    },
    Thur{
        override fun day():String= "Четверг"
        override fun days()=4
        override fun weekend():String="Рабочий день"
        override fun Motivation(): String="Терпим, терпим"
    },
    Fri{
        override fun day():String= "Пятница"
        override fun days()=5
        override fun weekend():String="Рабочий день"
        override fun Motivation(): String="Почти, почти"
    },
    Sat{
        override fun day():String= "Суббота"
        override fun days()=6
        override fun weekend():String="Выходной"
        override fun Motivation(): String="Ура"
    },
    Sun{
        override fun day():String= "Воскресенье"
        override fun days()=7
        override fun weekend():String="Выходной"
        override fun Motivation(): String="Отдыхаем"
    };
    abstract fun day(): String
    abstract fun days(): Int
    abstract fun weekend(): String
    abstract fun Motivation(): String
}