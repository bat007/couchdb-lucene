package org.apache.couchdb.lucene;

/**
 * Copyright 2009 Robert Newson
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

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.queryParser.QueryParser;

final class Config {

	static final Analyzer ANALYZER = new StandardAnalyzer();

	static final String DEFAULT_FIELD = System.getProperty("couchdb.lucene.default_field", "body");

	static final QueryParser QP = new QueryParser(DEFAULT_FIELD, ANALYZER);

	static final String DB = "_db";

	static final String ID = "_id";

	static final String SEQ = "_seq";

	static final String BODY = "_body";

	static final String TITLE = "_title";

	static final String AUTHOR = "_author";

	static final String INDEX_DIR = System.getProperty("couchdb.lucene.dir", "lucene");

	static final int RAM_BUF = Integer.getInteger("couchdb.lucene.ram", 256);

	static final int BATCH_SIZE = Integer.getInteger("couchdb.lucene.batch", 1000);

	static final String DB_URL = System.getProperty("couchdb.url", "http://localhost:5984");

	static final String DB_USER = System.getProperty("couchdb.user");

	static final String DB_PASSWORD = System.getProperty("couchdb.password");

	static final int MAX_LIMIT = Integer.getInteger("couchdb.lucene.max_fetch", 250);

	static final int CHANGE_THRESHOLD = Integer.getInteger("couchdb.lucene.change_threshold", 100);

	static final int TIME_THRESHOLD = Integer.getInteger("couchdb.lucene.time_threshold", 60);

}
