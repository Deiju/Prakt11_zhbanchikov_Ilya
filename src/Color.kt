enum class Color {
    BLUE {
        override fun colorName() = "Голубой";
        override val HEX = "0x0000FF";
        override fun place_in_the_rainbow() = "5 место в радуге";
        override fun shades()=3
    },
    RED {
        override fun colorName() = "Красный";
        override val HEX = "0xFF0000";
        override fun place_in_the_rainbow() = "1 место в радуге";
        override fun shades()=26
    },
    GREEN {
        override fun colorName() = "Зелёный";
        override val HEX = "0x00FF00";
        override fun place_in_the_rainbow() = "4 место в радуге";
        override fun shades()=20
    },
    PINK{
        override fun colorName() = "Розовый";
        override val HEX = "0xFFC0CB";
        override fun place_in_the_rainbow() ="Отсутствует в радуге";
        override fun shades()=12
    },
    YELLOW{
        override fun colorName() = "Жёлтый";
        override val HEX = "0xFFFF00";
        override fun place_in_the_rainbow() = "3 место в радуге";
        override fun shades()=40
    };
    abstract fun shades():Int
    abstract fun place_in_the_rainbow(): String
    abstract fun colorName(): String
    abstract val HEX: String

}