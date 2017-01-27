package com.thinkbiganalytics.metadata.api.jobrepo;

/*-
 * #%L
 * thinkbig-operational-metadata-api
 * %%
 * Copyright (C) 2017 ThinkBig Analytics
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Created by sr186054 on 9/1/16.
 */
public interface ExecutionConstants {


    /**
     * Common data types for the {@link com.thinkbiganalytics.metadata.api.jobrepo.step.BatchStepExecutionContextValue}, {@link com.thinkbiganalytics.metadata.api.jobrepo.job.BatchJobExecutionContextValue},
     * and {@link com.thinkbiganalytics.metadata.api.jobrepo.job.BatchJobExecutionParameter}
     */
    enum ParamType {
        STRING, DOUBLE, DATE, LONG
    }

    /**
     * Exit codes indicating how a {@link com.thinkbiganalytics.metadata.api.jobrepo.job.BatchJobExecution} and {@link com.thinkbiganalytics.metadata.api.jobrepo.step.BatchStepExecution} finish
     */
    enum ExitCode {
        COMPLETED,
        STOPPED,
        FAILED,
        ABANDONED,
        EXECUTING,
        NOOP,
        WARNING,
        UNKNOWN;
    }
}
