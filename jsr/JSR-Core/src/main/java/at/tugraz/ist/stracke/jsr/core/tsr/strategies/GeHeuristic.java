package at.tugraz.ist.stracke.jsr.core.tsr.strategies;

import at.tugraz.ist.stracke.jsr.core.coverage.CoverageReport;
import at.tugraz.ist.stracke.jsr.core.shared.TestSuite;
import at.tugraz.ist.stracke.jsr.core.tsr.ReducedTestSuite;
import com.google.common.collect.HashBasedTable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.checkerframework.checker.nullness.qual.NonNull;

public class GeHeuristic extends BaseReductionStrategy{

    // Used to call the function
    public GeHeuristic() {

        super(LogManager.getLogger(GeHeuristic.class));
        for (int i = 0; i < 10; i++) {
            logger.fatal("REEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
        }

    }
    // testing ?
    public GeHeuristic(@NonNull TestSuite testSuite, @NonNull CoverageReport coverageReport, @NonNull Logger logger) {
        super(testSuite, coverageReport,LogManager.getLogger(GeHeuristic.class));
    }

    @Override
    public @NonNull ReducedTestSuite reduce() {
        logger.fatal(table);
        return null;
    }

    @Override
    public void setCoverageReport(CoverageReport report) {
        this.table = HashBasedTable.create();
        this.coverageReport = report;
    }

    @Override
    public void setOriginalTestSuite(TestSuite testSuite) {
        this.originalTestsuite = testSuite;
    }

    @Override
    public void keepZeroCoverageTCs(boolean keep) {

    }
}
