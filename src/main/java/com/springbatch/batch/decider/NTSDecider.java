package com.springbatch.batch.decider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.job.flow.FlowExecutionStatus;
import org.springframework.batch.core.job.flow.JobExecutionDecider;

@Slf4j
public class NTSDecider implements JobExecutionDecider {
    private static final String JOB_STATUS="JOB_STATUS";
    private static final String CONTINUE = "CONTINUE";
    private static final String FAILED = "FAILED";
    private static final String COMPLETED = "COMPLETED";

    @Override
    public FlowExecutionStatus decide(JobExecution jobExecution, StepExecution stepExecution) {
        BatchStatus stepStatus = jobExecution.getStatus();
        FlowExecutionStatus flowExecutionStatus = null;

        if (CONTINUE.equals(stepStatus)) {
            flowExecutionStatus = new FlowExecutionStatus(CONTINUE);
        } else if (FAILED.equals(stepStatus)) {
            flowExecutionStatus = new FlowExecutionStatus(FAILED);
        } else {
            flowExecutionStatus = new FlowExecutionStatus(COMPLETED);
        }
        return flowExecutionStatus;
    }
}