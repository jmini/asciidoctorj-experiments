package html2adoc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    html2adoc.format.EmphasisTest.class,
    html2adoc.format.MonospaceTest.class,
    html2adoc.format.StrongTest.class,
    html2adoc.format.SubscriptTest.class,
    html2adoc.format.SuperscriptTest.class,
    html2adoc.header.HeaderTest.class,
    html2adoc.image.ImageTest.class,
    html2adoc.link.LinkTest.class,
    html2adoc.list.ListTest.class,
    html2adoc.listing.ListingTest.class,
    html2adoc.paragraph.ParagraphTest.class,
    html2adoc.table.TableTest.class,
    html2adoc.unknown.UnknownTest.class
})
public class AllTests {
}
