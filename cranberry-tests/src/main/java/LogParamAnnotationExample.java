/**
 * Copyright 2020 the project cranberry authors
 * and the original author or authors annotated by {@author}
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.cranberry.logging.annotation.LogParam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * project cranberry
 * created 2020-04-26 10:27
 * 
 * @author Alexander A. Kropotin
 */
public class LogParamAnnotationExample {

    public static void main(String args[]) {
        runWithoutCustomMessage(Arrays.stream(args).collect(Collectors.toList()));
        runWithCustomMessage(Arrays.stream(args).collect(Collectors.toList()));
    }

    /**
     * The example of {@code @LogParam} annotation usage on {@code List<String> param}.
     * 
     * When this method is called, the parameters will be displayed in the log;
     * Messages in the log will label the format {@char "name of param = param"} for each parameter.
     */
    @LogParam
    public static void runWithoutCustomMessage(List<String> param) {
        param.stream()
                .forEach(eachParam -> {
                    System.out.println(eachParam);
                });
    }

    /**
     * The example of {@code @LogParam} annotation usage on {@code List<String> param}.
     * 
     * When this method is called, the parameters will be displayed in the log;
     * Messages in the log will label the format {@char "message param"} for each parameter.
     */
    @LogParam(message = "Start execution with param =")
    public static void runWithCustomMessage(List<String> param) {
        param.stream()
                .forEach(eachParam -> {
                    System.out.println(eachParam);
                });
    }
}
