/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.htmldsl.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.example.htmldsl.htmlDsl.WebSite;
import org.xtext.example.htmldsl.tests.HtmlDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(HtmlDslInjectorProvider.class)
@SuppressWarnings("all")
public class HtmlDslParsingTest {
  @Inject
  private ParseHelper<WebSite> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final WebSite result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
