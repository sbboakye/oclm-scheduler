package com.sambeth.oclm.utils.random

final case class Seed(long: Long) {
  def next: Seed = Seed(long * 6364136223846793005L + 1442695040888963407L)
}
