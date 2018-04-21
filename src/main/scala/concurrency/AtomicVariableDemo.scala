package concurrency

import java.util.concurrent.atomic.AtomicLong

object AtomicVariableDemo extends App{
  private val uid = new AtomicLong(0L)
  def getUniqueId(): Long = uid.incrementAndGet()
}
