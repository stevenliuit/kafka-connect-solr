package com.github.jcustenborder.kafka.connect.solr;

import com.github.jcustenborder.kafka.connect.utils.BaseDocumentationTest;

public class DocumentationTest extends BaseDocumentationTest {
  @Override
  protected String[] packages() {
    return new String[]{this.getClass().getPackage().getName()};
  }
}
