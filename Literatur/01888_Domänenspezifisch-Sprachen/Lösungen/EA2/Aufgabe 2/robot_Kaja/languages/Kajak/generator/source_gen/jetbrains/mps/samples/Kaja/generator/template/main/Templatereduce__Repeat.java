package jetbrains.mps.samples.Kaja.generator.template.main;

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
import org.jetbrains.mps.openapi.model.SNodeAccessUtil;
import jetbrains.mps.generator.runtime.TemplateUtil;
import jetbrains.mps.generator.template.PropertyMacroContext;
import java.util.Collection;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.runtime.NodeWeaveFacility;

@Generated
public class Templatereduce__Repeat extends TemplateDeclarationBase {
  public Templatereduce__Repeat() {
  }
  public SNodeReference getTemplateNode() {
    return new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039660392");
  }
  protected SNode applyPart0(@NotNull final TemplateContext context) throws GenerationException {
    final TemplateExecutionEnvironment environment = context.getEnvironment();
    final SNode tnode1 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10a698082feL, "jetbrains.mps.baseLanguage.structure.ForStatement"));
    try {
      environment.nodeCopied(context, tnode1, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660398");
      TemplateContext context1 = context.subContext();
      {
        final SNode tnode2 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc67c7efL, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration"));
        try {
          environment.nodeCopied(context1, tnode2, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660399");
          SNodeAccessUtil.setProperty(tnode2, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_859008965969411038(new PropertyMacroContext(context1, "i", propertyMacro_bc3eh9_c0a0c0b0b0c0c0c))));
          TemplateContext context2 = context1.subContext();
          {
            final SNode tnode3 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf940d22479L, "jetbrains.mps.baseLanguage.structure.IntegerType"));
            try {
              environment.nodeCopied(context2, tnode3, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660401");
            } finally {
            }
            if (tnode3 != null) {
              tnode2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x450368d90ce15bc3L, 0x4ed4d318133c80ceL, "type"), tnode3);
            }
            // TODO validate child 
          }
          {
            final SNode tnode4 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant"));
            try {
              environment.nodeCopied(context2, tnode4, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660403");
              SNodeAccessUtil.setProperty(tnode4, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "0");
            } finally {
            }
            if (tnode4 != null) {
              tnode2.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c37a7f6eL, 0xf8c37f506eL, "initializer"), tnode4);
            }
            // TODO validate child 
          }
        } finally {
        }
        if (tnode2 != null) {
          tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10a697996feL, 0x10a6979f36bL, "variable"), tnode2);
        }
        // TODO validate child 
      }
      {
        final SNode tnode5 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, "jetbrains.mps.baseLanguage.structure.StatementList"));
        try {
          environment.nodeCopied(context1, tnode5, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660400");
          TemplateContext context5 = context1.subContext();
          {
            Collection<SNode> tlist6 = null;
            final SNode copySrcInput6 = QueriesGenerated.sourceNodeQuery_3308300503039939727(new SourceSubstituteMacroNodeContext(context5, copySrcMacro_bc3eh9_b0a0c0c0b0d0c0c));
            tlist6 = environment.copyNodes(TemplateUtil.singletonList(copySrcInput6), copySrcMacro_bc3eh9_b0a0c0c0b0d0c0c, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039939717", context5);
            for (SNode child7 : TemplateUtil.asNotNull(tlist6)) {
              tnode5.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), child7);
            }
            // TODO validate child 
          }
        } finally {
        }
        if (tnode5 != null) {
          tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10cb1ac5adeL, 0x10cb1ada6e8L, "body"), tnode5);
        }
        // TODO validate child 
      }
      {
        final SNode tnode8 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbced3b82aL, "jetbrains.mps.baseLanguage.structure.LessThanExpression"));
        try {
          environment.nodeCopied(context1, tnode8, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660425");
          TemplateContext context8 = context1.subContext();
          {
            final SNode tnode9 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, "jetbrains.mps.baseLanguage.structure.IntegerConstant"));
            try {
              environment.nodeCopied(context8, tnode9, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660428");
              SNodeAccessUtil.setProperty(tnode9, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), TemplateUtil.asString(QueriesGenerated.propertyMacro_GetPropertyValue_3308300503039660463(new PropertyMacroContext(context8, "10", propertyMacro_bc3eh9_c0a0c0b0b0c0b0e0c0c))));
            } finally {
            }
            if (tnode9 != null) {
              tnode8.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11bL, "rightExpression"), tnode9);
            }
            // TODO validate child 
          }
          {
            final SNode tnode10 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"));
            try {
              environment.nodeCopied(context8, tnode10, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/4265636116363070570");
              environment.resolveInTemplateLater(tnode10, "variableDeclaration", templateNode_bc3eh9_c0a1a1a3a1a4a2a2, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660399", "i", context8);
            } finally {
            }
            if (tnode10 != null) {
              tnode8.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xfbdeb6fecfL, 0xfbdeb7a11cL, "leftExpression"), tnode10);
            }
            // TODO validate child 
          }
        } finally {
        }
        if (tnode8 != null) {
          tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10a698082feL, 0x10a69819132L, "condition"), tnode8);
        }
        // TODO validate child 
      }
      {
        final SNode tnode11 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x11adecdb4f0L, "jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression"));
        try {
          environment.nodeCopied(context1, tnode11, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660450");
          TemplateContext context11 = context1.subContext();
          {
            final SNode tnode12 = environment.createOutputNode(MetaAdapterFactory.getConcept(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8c77f1e98L, "jetbrains.mps.baseLanguage.structure.VariableReference"));
            try {
              environment.nodeCopied(context11, tnode12, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/4265636116363077196");
              environment.resolveInTemplateLater(tnode12, "variableDeclaration", templateNode_bc3eh9_c0a1a1a2a1a5a2a2, "tpl/r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185/3308300503039660399", "i", context11);
            } finally {
            }
            if (tnode12 != null) {
              tnode11.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x120a4c1f269L, 0x120a4c433a6L, "expression"), tnode12);
            }
            // TODO validate child 
          }
        } finally {
        }
        if (tnode11 != null) {
          tnode1.addChild(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x10a698082feL, 0x10a6981b2c5L, "iteration"), tnode11);
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
    weaveSupport.weaveNode(MetaAdapterFactory.getContainmentLink(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc56b200L, 0xf8cc6bf961L, "statement"), tnodepart0);
    return TemplateUtil.singletonList(tnodepart0);
  }
  private static SNodePointer propertyMacro_bc3eh9_c0a0c0b0b0c0c0c = new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "859008965969411037");
  private static SNodePointer copySrcMacro_bc3eh9_b0a0c0c0b0d0c0c = new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039939724");
  private static SNodePointer propertyMacro_bc3eh9_c0a0c0b0b0c0b0e0c0c = new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "3308300503039660460");
  private static SNodePointer templateNode_bc3eh9_c0a1a1a3a1a4a2a2 = new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "4265636116363070570");
  private static SNodePointer templateNode_bc3eh9_c0a1a1a2a1a5a2a2 = new SNodePointer("r:3ab3501c-2f4b-48e6-9b6c-e31ff8ef3185(jetbrains.mps.samples.Kaja.generator.template.main@generator)", "4265636116363077196");
}
