// Temel kazısı yapan coroutine
suspend fun kaziyiYap() {
    println("Temel kazısı yapılıyor...")
    delay(2000) // 2 saniye boyunca temel kazısı yapılıyor gibi düşünelim
    println("Temel kazısı tamamlandı!")
}