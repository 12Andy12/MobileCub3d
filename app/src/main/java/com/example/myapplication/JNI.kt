package com.example.myapplication

object JNI {
    //System.LoadLibrary(String libname) – статический метод, который загружает общую библиотеку
    // из файловой системы в память
    // и делает ее экспортированные функции доступными для нашего кода Java.
    init {
        System.loadLibrary("native-lib")
    }

    //любой метод, помеченный как native, должен быть реализован в собственной общей библиотеке.
    external fun onsurfacecreated()
    external fun onsurfacechanged(width: Int, height: Int)
    external fun ondrawframe()
}