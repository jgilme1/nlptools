package edu.washington.cs.knowitall
package tool
package sentence

import spiaotools.SentParDetector

import common.main.LineProcessor
import opennlp.tools.sentdetect._

/** A heuristic-based sentencer. */
class PiaoSentencer() extends Sentencer {
  val sentencer = new SentParDetector
  def sentences(document: String) = 
    sentencer.markupRawText(2, document).split("\\n+")
}

object PiaoSentencer
extends SentencerMain {
  lazy val sentencer = new PiaoSentencer
}

