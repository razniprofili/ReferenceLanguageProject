package ReferenceLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.text.rt.TextGenDescriptorBase;
import jetbrains.mps.text.rt.TextGenContext;
import jetbrains.mps.text.impl.TextGenSupport;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;

public class Manual_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("[");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.serNumber$3owZ) + "] ");
    {
      Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.authors$vrNJ);
      final SNode lastItem = Sequence.fromIterable(collection).last();
      for (SNode item : collection) {
        tgs.appendNode(item);
        if (item != lastItem) {
          tgs.append(", ");
        }
      }
    }
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.title$vshL));
    tgs.append(". ");
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.organization$vsJN) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.organization$vsJN) + ", ");
    }
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$vtsQ) != null) {
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$vtsQ) + ", ");
    }
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$vzkf) + ".");
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$3owZ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555fd52cL, 0x1159e6fb6e9e4ecbL, "serNumber");
    /*package*/ static final SProperty title$vshL = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, 0x536290f98ef226c6L, "title");
    /*package*/ static final SProperty organization$vsJN = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, 0x536290f98ef226c8L, "organization");
    /*package*/ static final SProperty address$vtsQ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, 0x536290f98ef226cbL, "address");
    /*package*/ static final SProperty year$vzkf = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, 0x536290f98ef226cfL, "year");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink authors$vrNJ = MetaAdapterFactory.getContainmentLink(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x536290f98ef226c3L, 0x536290f98ef226c4L, "authors");
  }
}
