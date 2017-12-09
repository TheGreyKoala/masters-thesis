/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.htmldsl.generator;

import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.xtext.example.htmldsl.htmlDsl.Anchor;
import org.xtext.example.htmldsl.htmlDsl.BodyElement;
import org.xtext.example.htmldsl.htmlDsl.Heading1;
import org.xtext.example.htmldsl.htmlDsl.Heading2;
import org.xtext.example.htmldsl.htmlDsl.Page;
import org.xtext.example.htmldsl.htmlDsl.Paragraph;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class HtmlDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<Page> _filter = Iterables.<Page>filter(_iterable, Page.class);
    for (final Page page : _filter) {
      String _name = page.getName();
      String _plus = (_name + ".html");
      CharSequence _compile = this.compile(page);
      fsa.generateFile(_plus, _compile);
    }
  }
  
  public CharSequence compile(final Page page) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<title>");
    String _name = page.getName();
    _builder.append(_name, "\t\t");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("</head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<body>");
    _builder.newLine();
    {
      EList<BodyElement> _bodyElements = page.getBodyElements();
      for(final BodyElement bodyElement : _bodyElements) {
        _builder.append("\t\t");
        CharSequence _compile = this.compile(bodyElement);
        _builder.append(_compile, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compile(final BodyElement bodyElement) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((bodyElement instanceof Heading1)) {
        _builder.append("<h1>");
        Heading1 _cast = Heading1.class.cast(bodyElement);
        String _text = _cast.getText();
        _builder.append(_text, "");
        _builder.append("</h1>");
        _builder.newLineIfNotEmpty();
      } else {
        if ((bodyElement instanceof Heading2)) {
          _builder.append("<h2>");
          Heading2 _cast_1 = Heading2.class.cast(bodyElement);
          String _text_1 = _cast_1.getText();
          _builder.append(_text_1, "");
          _builder.append("</h2>");
          _builder.newLineIfNotEmpty();
        } else {
          if ((bodyElement instanceof Paragraph)) {
            _builder.append("<p>");
            Paragraph _cast_2 = Paragraph.class.cast(bodyElement);
            String _text_2 = _cast_2.getText();
            _builder.append(_text_2, "");
            _builder.append("</p>");
            _builder.newLineIfNotEmpty();
          } else {
            if ((bodyElement instanceof Anchor)) {
              _builder.append("<p><a href=\"");
              Anchor _cast_3 = Anchor.class.cast(bodyElement);
              Page _destination = _cast_3.getDestination();
              String _name = _destination.getName();
              _builder.append(_name, "");
              _builder.append(".html\">");
              Anchor _cast_4 = Anchor.class.cast(bodyElement);
              Page _destination_1 = _cast_4.getDestination();
              String _name_1 = _destination_1.getName();
              _builder.append(_name_1, "");
              _builder.append("</a></p>");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      }
    }
    return _builder;
  }
}
