package at.tugraz.ist.stracke.jsr.cli.candidates;

import at.tugraz.ist.stracke.jsr.core.tsr.strategies.GeHeuristic;

import java.util.ArrayList;
import java.util.Arrays;

public class AlgorithmCandidates extends ArrayList<String> {
  public static final String ALG_GREEDY_HGS = "greedyHGS";
  public static final String ALG_DELAYED_GREEDY = "delayedGreedy";
  public static final  String ALG_GENETIC = "genetic";
  public static final String ALG_GE ="geheuristic";
  public static final String ALG_GRE ="greheuristic";

  AlgorithmCandidates() {
    super(Arrays.asList(ALG_GREEDY_HGS, ALG_DELAYED_GREEDY, ALG_GENETIC, ALG_GE, ALG_GRE));
  }

}
