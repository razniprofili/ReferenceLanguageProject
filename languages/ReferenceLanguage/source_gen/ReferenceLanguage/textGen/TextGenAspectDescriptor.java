package ReferenceLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenAspectBase;
import ReferenceLanguage.structure.LanguageConceptSwitch;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.text.rt.TextGenDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.text.rt.TextGenModelOutline;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class TextGenAspectDescriptor extends TextGenAspectBase {
  private final LanguageConceptSwitch myIndex = new LanguageConceptSwitch();

  public TextGenAspectDescriptor() {
  }

  @Nullable
  @Override
  public TextGenDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    switch (myIndex.index(concept)) {
      case LanguageConceptSwitch.Article:
        return new Article_TextGen();
      case LanguageConceptSwitch.Author:
        return new Author_TextGen();
      case LanguageConceptSwitch.Book:
        return new Book_TextGen();
      case LanguageConceptSwitch.Booklet:
        return new Booklet_TextGen();
      case LanguageConceptSwitch.Conference:
        return new Conference_TextGen();
      case LanguageConceptSwitch.InBook:
        return new InBook_TextGen();
      case LanguageConceptSwitch.InProceedings:
        return new InProceedings_TextGen();
      case LanguageConceptSwitch.Incollection:
        return new Incollection_TextGen();
      case LanguageConceptSwitch.Libraries:
        return new Libraries_TextGen();
      case LanguageConceptSwitch.Manual:
        return new Manual_TextGen();
      case LanguageConceptSwitch.MasterThesis:
        return new MasterThesis_TextGen();
      case LanguageConceptSwitch.Misc:
        return new Misc_TextGen();
      case LanguageConceptSwitch.PhdThesis:
        return new PhdThesis_TextGen();
      case LanguageConceptSwitch.Proceedings:
        return new Proceedings_TextGen();
    }
    return null;
  }

  @Override
  public void breakdownToUnits(@NotNull TextGenModelOutline outline) {
    for (SNode root : outline.getModel().getRootNodes()) {
      if (root.getConcept().equals(CONCEPTS.Libraries$A5)) {
        String fname = getFileName_Libraries(root);
        String ext = getFileExtension_Libraries(root);
        outline.registerTextUnit((ext == null ? fname : (fname + '.' + ext)), root);
        continue;
      }
    }
  }
  private static String getFileName_Libraries(SNode node) {
    return "Library";
  }
  private static String getFileExtension_Libraries(SNode node) {
    return "txt";
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Libraries$A5 = MetaAdapterFactory.getConcept(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555e32e8L, "ReferenceLanguage.structure.Libraries");
  }
}
