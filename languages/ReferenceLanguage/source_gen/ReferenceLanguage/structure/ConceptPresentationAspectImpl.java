package ReferenceLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Article;
  private ConceptPresentation props_Author;
  private ConceptPresentation props_Book;
  private ConceptPresentation props_Booklet;
  private ConceptPresentation props_Conference;
  private ConceptPresentation props_InBook;
  private ConceptPresentation props_InProceedings;
  private ConceptPresentation props_Incollection;
  private ConceptPresentation props_Libraries;
  private ConceptPresentation props_Manual;
  private ConceptPresentation props_MasterThesis;
  private ConceptPresentation props_Misc;
  private ConceptPresentation props_PhdThesis;
  private ConceptPresentation props_Proceedings;
  private ConceptPresentation props_ReferenceType;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Article:
        if (props_Article == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Article = cpb.create();
        }
        return props_Article;
      case LanguageConceptSwitch.Author:
        if (props_Author == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Author");
          props_Author = cpb.create();
        }
        return props_Author;
      case LanguageConceptSwitch.Book:
        if (props_Book == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Book = cpb.create();
        }
        return props_Book;
      case LanguageConceptSwitch.Booklet:
        if (props_Booklet == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Booklet = cpb.create();
        }
        return props_Booklet;
      case LanguageConceptSwitch.Conference:
        if (props_Conference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Conference = cpb.create();
        }
        return props_Conference;
      case LanguageConceptSwitch.InBook:
        if (props_InBook == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_InBook = cpb.create();
        }
        return props_InBook;
      case LanguageConceptSwitch.InProceedings:
        if (props_InProceedings == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_InProceedings = cpb.create();
        }
        return props_InProceedings;
      case LanguageConceptSwitch.Incollection:
        if (props_Incollection == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Incollection = cpb.create();
        }
        return props_Incollection;
      case LanguageConceptSwitch.Libraries:
        if (props_Libraries == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Libraries");
          props_Libraries = cpb.create();
        }
        return props_Libraries;
      case LanguageConceptSwitch.Manual:
        if (props_Manual == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Manual = cpb.create();
        }
        return props_Manual;
      case LanguageConceptSwitch.MasterThesis:
        if (props_MasterThesis == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_MasterThesis = cpb.create();
        }
        return props_MasterThesis;
      case LanguageConceptSwitch.Misc:
        if (props_Misc == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Misc = cpb.create();
        }
        return props_Misc;
      case LanguageConceptSwitch.PhdThesis:
        if (props_PhdThesis == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_PhdThesis = cpb.create();
        }
        return props_PhdThesis;
      case LanguageConceptSwitch.Proceedings:
        if (props_Proceedings == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Proceedings = cpb.create();
        }
        return props_Proceedings;
      case LanguageConceptSwitch.ReferenceType:
        if (props_ReferenceType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_ReferenceType = cpb.create();
        }
        return props_ReferenceType;
    }
    return null;
  }
}
