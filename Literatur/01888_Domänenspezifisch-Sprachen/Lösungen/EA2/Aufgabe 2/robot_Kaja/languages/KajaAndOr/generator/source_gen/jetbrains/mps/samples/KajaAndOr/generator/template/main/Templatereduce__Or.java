package jetbrains.mps.samples.KajaAndOr.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.runtime.TemplateDeclarationBase;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.runtime.TemplateContext;
import jetbrains.mps.generator.runtime.GenerationException;
import jetbrains.mps.generator.runtime.TemplateExecutionEnvironment;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import java.util.Collection;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;

@Generated
public class Templatereduce__Or extends TemplateDeclarationBase {
  public Templatereduce__Or() {
  }
  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:68ff4d81-c742-4f6c-8cc1-cdf3e94f2c2e(jetbrains.mps.samples.KajaAndOr.generator.template.main@generator)", "1904811872814327665");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, "jetbrains.mps.baseLanguage.structure.ParenthesizedExpression"));
    try {
      environment.nodeCopied(context, tnode1, "tpl/r:68ff4d81-c742-4f6c-8cc1-cdf3e94f2c2e/1904811872814344170");
      TemplateContext context1 = context.subContext();
      {
        final SNode tnode2 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb8255689fL, "jetbrains.mps.baseLanguage.structure.OrExpression"));
        try {
          environment.nodeCopied(context1, tnode2, "tpl/r:68ff4d81-c742-4f6c-8cc1-cdf3e94f2c2e/1904811872814344193");
          TemplateContext context2 = context1.subContext();
          {
            Collection<SNode> tlist3 = null;
            final SNode copySrcInput3 = QueriesGenerated.sourceNodeQuery_1904811872814344212(new SourceSubstituteMacroNodeContext(context2, copySrcMacro_a6zodt_b0a0c0c0b0c0c0c));
            tlist3 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput3), copySrcMacro_a6zodt_b0a0c0c0b0c0c0c, "tpl/r:68ff4d81-c742-4f6c-8cc1-cdf3e94f2c2e/1904811872814344196", context2);
            for (SNode child4 : TemplateUtil.asNotNull(tlist3)) {
              tnode2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"), child4);
            }
            // TODO validate child 
          }
          {
            Collection<SNode> tlist5 = null;
            final SNode copySrcInput5 = QueriesGenerated.sourceNodeQuery_1904811872814344202(new SourceSubstituteMacroNodeContext(context2, copySrcMacro_a6zodt_b0a0c0d0b0c0c0c));
            tlist5 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput5), copySrcMacro_a6zodt_b0a0c0d0b0c0c0c, "tpl/r:68ff4d81-c742-4f6c-8cc1-cdf3e94f2c2e/1904811872814344172", context2);
            for (SNode child6 : TemplateUtil.asNotNull(tlist5)) {
              tnode2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"), child6);
            }
            // TODO validate child 
          }
        } finally {
        }
        if (tnode2 != null) {
          tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfb4ed32b7fL, 0xfb4ed32b80L, "expression"), tnode2);
        }
        // TODO validate child 
      }
    } finally {
    }
    return tnode1;
  }
  @Override
  public Collection<SNode> apply(@NotNull TemplateExecutionEnvironment environment, @NotNull TemplateContext context) throws GenerationException {
    return TemplateUtil.singletonList(applyPart0(context));
  }

  @Override
  public Collection<SNode> weave(@NotNull NodeWeaveFacility.WeaveContext weaveContext, @NotNull NodeWeaveFacility weaveSupport) throws GenerationException {
    final TemplateContext templateContext = weaveSupport.getTemplateContext();
    SNode tnodepart0 = applyPart0(templateContext);
    weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b217L, 0xf8cc56b218L, "condition"), tnodepart0);
    return TemplateUtil.singletonList(tnodepart0);
  }
  private static SNodePointer copySrcMacro_a6zodt_b0a0c0c0b0c0c0c = new SNodePointer("r:68ff4d81-c742-4f6c-8cc1-cdf3e94f2c2e(jetbrains.mps.samples.KajaAndOr.generator.template.main@generator)", "1904811872814344209");
  private static SNodePointer copySrcMacro_a6zodt_b0a0c0d0b0c0c0c = new SNodePointer("r:68ff4d81-c742-4f6c-8cc1-cdf3e94f2c2e(jetbrains.mps.samples.KajaAndOr.generator.template.main@generator)", "1904811872814344199");
}
