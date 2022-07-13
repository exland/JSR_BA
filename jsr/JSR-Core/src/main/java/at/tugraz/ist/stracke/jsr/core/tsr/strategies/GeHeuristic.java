package at.tugraz.ist.stracke.jsr.core.tsr.strategies;

import at.tugraz.ist.stracke.jsr.core.coverage.CoverageReport;
import at.tugraz.ist.stracke.jsr.core.shared.TestSuite;
import at.tugraz.ist.stracke.jsr.core.tsr.ReducedTestSuite;
import org.checkerframework.checker.nullness.qual.NonNull;

public class GeHeuristic implements ReductionStrategy{

    @Override
    public @NonNull ReducedTestSuite reduce() {
        return null;
    }

    @Override
    public void setCoverageReport(CoverageReport report) {

    }

    @Override
    public void setOriginalTestSuite(TestSuite testSuite) {

    }

    @Override
    public void keepZeroCoverageTCs(boolean keep) {

    }
}
