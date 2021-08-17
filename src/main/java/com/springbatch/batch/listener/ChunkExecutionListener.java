package com.springbatch.batch.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.listener.ChunkListenerSupport;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.scope.context.StepContext;

@Slf4j
public class ChunkExecutionListener extends ChunkListenerSupport {

    @Override
    public void beforeChunk(ChunkContext context) {
        StepContext stepContext = context.getStepContext();
        StepExecution stepExecution = stepContext.getStepExecution();
        log.info("###### beforeChunk : " + stepExecution.getReadCount());
    }

    @Override
    public void afterChunk(ChunkContext context) {
        StepContext stepContext = context.getStepContext();
        StepExecution stepExecution = stepContext.getStepExecution();
        log.info("##### afterChunk : " + stepExecution.getCommitCount());
    }

    @Override
    public void afterChunkError(ChunkContext context) {
        StepContext stepContext = context.getStepContext();
        StepExecution stepExecution = stepContext.getStepExecution();
        log.info("##### afterChunkError : " + stepExecution.getRollbackCount());
    }
}