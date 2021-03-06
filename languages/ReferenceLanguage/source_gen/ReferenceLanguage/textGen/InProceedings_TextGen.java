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

public class InProceedings_TextGen extends TextGenDescriptorBase {
  @Override
  public void generateText(final TextGenContext ctx) {
    final TextGenSupport tgs = new TextGenSupport(ctx);
    tgs.append("[");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.serNumber$3owZ) + "] ");
    {
      Iterable<SNode> collection = SLinkOperations.getChildren(ctx.getPrimaryInput(), LINKS.authors$9PDJ);
      final SNode lastItem = Sequence.fromIterable(collection).last();
      for (SNode item : collection) {
        tgs.appendNode(item);
        if (item != lastItem) {
          tgs.append(", ");
        }
      }
    }
    tgs.append(". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.title$9QmM));
    tgs.append(". ");
    tgs.append("In ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.bookTitle$9R3P));
    tgs.append(", ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.series$9Xaf));
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.pages$aaL9) != null) {
      tgs.append(", pages ");
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.pages$aaL9));
    }
    if (SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$aqgb) != null) {
      tgs.append(", ");
      tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.address$aqgb));
    }
    tgs.append(", ");
    tgs.append(SPropertyOperations.getInteger(ctx.getPrimaryInput(), PROPS.year$a3IF) + ". ");
    tgs.append(SPropertyOperations.getString(ctx.getPrimaryInput(), PROPS.publisher$aihD));
    tgs.append(".");
  }

  private static final class PROPS {
    /*package*/ static final SProperty serNumber$3owZ = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1e3ba47b555fd52cL, 0x1159e6fb6e9e4ecbL, "serNumber");
    /*package*/ static final SProperty title$9QmM = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc66L, "title");
    /*package*/ static final SProperty bookTitle$9R3P = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc69L, "bookTitle");
    /*package*/ static final SProperty series$9Xaf = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc6eL, "series");
    /*package*/ static final SProperty pages$aaL9 = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc7eL, "pages");
    /*package*/ static final SProperty address$aqgb = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc96L, "address");
    /*package*/ static final SProperty year$a3IF = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc75L, "year");
    /*package*/ static final SProperty publisher$aihD = MetaAdapterFactory.getProperty(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc89L, "publisher");
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink authors$9PDJ = MetaAdapterFactory.getContainmentLink(0x28685c99a6841f2L, 0x9f1069a76b1b1f42L, 0x1a03dc0acd30fc62L, 0x1a03dc0acd30fc63L, "authors");
  }
}
