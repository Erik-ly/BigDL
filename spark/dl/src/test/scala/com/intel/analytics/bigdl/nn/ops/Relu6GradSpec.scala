/*
 * Copyright 2016 The BigDL Authors.
 *
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
 */

package com.intel.analytics.bigdl.nn.ops

import com.intel.analytics.bigdl.tensor.Tensor
import com.intel.analytics.bigdl.utils.T
import com.intel.analytics.bigdl.utils.serializer.ModuleSerializationTest

import scala.util.Random

class Relu6GradSerialTest extends ModuleSerializationTest {
  override def test(): Unit = {
    val relu6Grad = Relu6Grad[Float, Float]().setName("relu6Grad")
    val input = T(Tensor[Float](5).apply1(_ => Random.nextFloat()),
      Tensor[Float](5).apply1(_ => Random.nextFloat()))
    runSerializationTest(relu6Grad, input)
  }
}