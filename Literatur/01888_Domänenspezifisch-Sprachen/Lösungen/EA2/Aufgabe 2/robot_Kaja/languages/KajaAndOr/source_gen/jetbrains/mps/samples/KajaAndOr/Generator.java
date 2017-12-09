package jetbrains.mps.samples.KajaAndOr;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.TemplateModuleBase;
import java.util.Collection;
import jetbrains.mps.generator.runtime.TemplateMappingPriorityRule;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateUtil;
import java.util.Arrays;
import org.jetbrains.mps.openapi.module.SModuleReference;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.language.SLanguage;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.language.LanguageRuntime;

public class Generator extends TemplateModuleBase {
  public static String MODULE_REF = "2b337a26-63f3-47f2-840c-26f48eebe5fa(jetbrains.mps.samples.KajaAndOr#1904811872814327543)";
  private final Language sourceLanguage;
  private final Collection<TemplateMappingPriorityRule> priorities;
  private Collection<TemplateModel> models;

  public Generator(Language sourceLanguage) {
    this.sourceLanguage = sourceLanguage;
    priorities = TemplateUtil.asCollection(TemplateUtil.createStrictlyTogetherRule(TemplateUtil.createRefExternal("2b337a26-63f3-47f2-840c-26f48eebe5fa(jetbrains.mps.samples.KajaAndOr#1904811872814327543)", TemplateUtil.createRefLocal()), TemplateUtil.createRefExternal("e104ec4c-a001-4f8f-b6bf-654f6a062891(jetbrains.mps.samples.Kaja#3265739055509559144)", TemplateUtil.createRefLocal())));
  }
  @Override
  public String getAlias() {
    return "jetbrains.mps.samples.KajaAndOr/<no name>";
  }

  @Override
  public Collection<TemplateModel> getModels() {
    if (models == null) {
      models = Arrays.asList(loadModel("jetbrains.mps.samples.KajaAndOr.generator.template.main.TemplateModelImpl"));
    }
    return models;
  }

  @Override
  public Collection<TemplateMappingPriorityRule> getPriorities() {
    return priorities;
  }

  @Override
  public SModuleReference getReference() {
    return PersistenceFacade.getInstance().createModuleReference(MODULE_REF);
  }

  @Override
  public Collection<SLanguage> getTargetLanguages() {
    SLanguage[] rv = new SLanguage[1];
    rv[0] = MetaAdapterFactory.getLanguage(MetaIdFactory.langId(0xf3061a5392264cc5L, 0xa443f952ceaf5816L), "jetbrains.mps.baseLanguage");
    return Arrays.asList(rv);
  }

  @Override
  public LanguageRuntime getSourceLanguage() {
    return sourceLanguage;
  }

  @Override
  public Collection<String> getReferencedModules() {
    return null;
  }
}
