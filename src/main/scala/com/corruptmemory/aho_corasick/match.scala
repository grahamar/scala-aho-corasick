/**
 * match.scala
 *
 * @author <a href="mailto:jim@corruptmemory.com">Jim Powers</a>
 *
 * Copyright 2011 Jim Powers
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

package com.corruptmemory.aho_corasick

/** A match result
 *
 * @param start The offset from the beginning of the string in characters to the beginning of the match
 * @param target The match target
 * @param actual The actual string matched
 * @param data Arbitrary user-supplied data associated with the target string
 */
case class Match[T](start:Int,target:String,actual:String,data:T)