object Main {
  def main(args: Array[String]): Unit = {

    val curso: String = "Algoritmos y Estructura de Datos"
    val notaMinima: Int = 61
    val entregaCompletada: Boolean = true

    val notasRecientes = List(75, 50, 88, 40, 92)

    val notasAprobadas = notasRecientes.filter(n => n >= notaMinima)

    // Salida de resultados
    println("Reporte de Investigación - Scala")
    println("Curso: " + curso)
    println("Notas procesadas: " + notasRecientes)
    println("Notas que cumplen el criterio: " + notasAprobadas)

    val resumen = ("Fase 2", 100.0)
    println("Estado de la " + resumen._1 + " con punteo ideal de: " + resumen._2)
  }
}
